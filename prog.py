import configparser, sys, os

config = configparser.ConfigParser()
args = sys.argv[:]
# default Config filename
filename = "config.ini"
# check args
if (len(args) == 3):
    if(args[1] == "--configuration"):
        if(not os.path.isfile(args[2])):
            print("Config file does not exist")
            sys.exit(1)
        else:
            filename = args[2]
    else :
        print("Invalid argument. Usage : prog.py --configuration [config file]")
        exit(1)
else:   #check envirement variable
    try:
        configFile = os.environ["FICHIER_DE_CONFIGURATION"]
        if(not os.path.isfile(configFile)):
            print("Config file does not exist")
            sys.exit(1)
        else:
            filename = configFile

    except KeyError: 
        print("No config file specified in environment variable")


# read config file
config.read(filename)
# db = config["database"]
for section in config.sections():
    print(section)
    for key in config[section]:
        print(key, config[section][key])
