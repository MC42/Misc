#!/bin/bash

#frc tool
#dependencies:
#curl / wget 
#jq
#this file


#usage
#./frc.sh [event] [team]
name="https://www.thebluealliance.com"
apiVersion="v2"

authString="mc42atgithub:testcode:1scr"

outputPath="./first_data/"
outputFile=$1$2

if [ -f $outputPath$outputFile ] 
then
	rm $outputPath$outputFile
fi

curl -s -o $outputPath$outputFile  $name/api/$apiVersion/team/$1$2?X-TBA-App-Id=$authString 

cat $outputPath$outputFile |  jq .
