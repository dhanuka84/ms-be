#!/bin/bash

docker rmi localhost:5000/ms-be:1.0.0 

mvn clean install


docker build -t ms-be:1.0.0 .

docker tag ms-be:1.0.0 localhost:5000/ms-be:1.0.0

docker push localhost:5000/ms-be:1.0.0

minikube ssh && docker pull localhost:5000/ms-be:1.0.0 && exit


