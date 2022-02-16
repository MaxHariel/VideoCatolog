#!/bin/bash
gradle --stop
gradle build --continuos --quite &
gradle bootRun