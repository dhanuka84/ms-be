#!/bin/bash

docker rmi localhost:5000/ms-be:1.0.0 

mvn clean install

# Registry addon with docker driver uses port 59053 please use that instead of default port 5000


docker build -t ms-be:1.0.0 .

docker tag ms-be:1.0.0 localhost:5000/ms-be:1.0.0

docker tag ms-be:1.0.0 localhost:59053/ms-be:1.0.0

docker push localhost:5000/ms-be:1.0.0
docker push localhost:59053/ms-be:1.0.0

minikube ssh && docker pull localhost:5000/ms-be:1.0.0 && exit


