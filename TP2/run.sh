#!/bin/sh

execute()
{
  echo $*
  $*
}

execute mvn clean compile

execute mvn exec:java -Dexec.mainClass="trois_tiers.Main"