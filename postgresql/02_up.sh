#!/bin/bash

docker run --env-file ./env.list -p 15432:5432 -d --name webbi-postgres webbi/postgresql