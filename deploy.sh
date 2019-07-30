#!/bin/sh
mvn clean install war:war
DISPLAY=:0.0 notify-send "Deploy Done!"