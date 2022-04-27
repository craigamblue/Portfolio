# Project 1

 ## Project Description

Migrated and containerized a RESTful Javalin web application to Spring Boot deployed using Docker-Compose. Application logs are exported using Promtail to Loki and monitored through a Grafana dashboard.

 ## Technologies used

* Tech 1 - Maven 3.8.4
* Tech 2 - Docker 20.10.13
* Tech 3 - Git 2.35.1.windows.2
* Tech 4 - Log4j
* Tech 5 - Spring Boot
* Tech 6 - Spring Data
* Tech 7 - Loki
* Tech 8 - Grafana
* Tech 9 - PostgreSQL

## Features

* Able to monitor resources with grafana dashboard
* Able to view custom metrics with prometheus
* Able to add and delete beers
* Containerized for easy deployment

## Future Features

* Alert monitoring
* Password hashing

# Getting Started

* Start by cloning repository
   * On GitHub.com, navigate to the main page of the repository.
   * Above the list of files, click Code.
   * In git command line type "git clone " and paste code and run
* Will need to have Docker open and running
* Will need environment variables for own Database stored on host system
* Navigate to path with Docker-compose.yml in command window
* Run "docker-compose up -d" command and all containers need will start running
* run localhost:8080/{endpoint} to get started
* run localhost:3000 to access Grafana




