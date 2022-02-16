#!/bin/bash

docker run -d -i -t  --rm  --name springboot \
--env SPRING_PROFILE=test \
--env SPRING_PROFILES_ACTIVE=test \
-p 9001:9001 \
ms-be:1.0.0