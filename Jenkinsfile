def projectName = 'stockPortfolioManager'
def version = "0.0.latest"
def dockerImageTag = "portfoliomanager:latest"

pipeline {
  agent any

  stages {
     stage('Build docker image') {
          // this stage also builds and tests the Java project using Maven
          steps {
            sh "docker build -t portfoliomanager ."
          }
      }
    stage('Deploy Container To Openshift') {
      steps {
        sh "oc login https://namdevops14.conygre.com:8443 --username admin --password admin --insecure-skip-tls-verify=true"
        sh "oc project portfoliomanager || oc new-project portfoliomanager"
        sh "oc delete all --selector app=portfoliomanager || echo 'Unable to delete all previous openshift resources'"
        sh "oc new-app portfoliomanager-l version=latest"
        sh "oc expose svc/portfoliomanager"
      }
    }
  }
}