terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 2.13.0"
    }
  }
}

provider "docker" {}


resource "docker_container" "db" {
  name  = "db"
  image = "mysql:5.7"
  restart = "always"
  env = [
     "MYSQL_ROOT_PASSWORD=wordpress",
     "MYSQL_DATABASE=wordpress",
     "MYSQL_USER=wordpress",
     "MYSQL_PASSWORD=wordpress"
  ]
}

resource "docker_container" "wordpress" {
  name  = "wordpress"
  image = "wordpress:latest"
  restart = "always"
  env = [
    "WORDPRESS_DB_HOST=db",
    "WORDPRESS_DB_NAME=wordpress",
    "WORDPRESS_DB_USER=wordpress",
    "WORDPRESS_DB_PASSWORD=wordpress"
  ]
  ports {
    internal = "80"
    external = "8000"
  }
	depends_on = [docker_container.db]
}
