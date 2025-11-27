#!/bin/zsh
# Maven wrapper script to use JDK 17.0.17
export JAVA_HOME=/usr/lib/jvm/jdk-17.0.17-oracle-x64
export PATH=$JAVA_HOME/bin:$PATH
cd "$(dirname "$0")"
./mvnw "$@"

