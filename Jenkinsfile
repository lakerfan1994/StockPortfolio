def projectName = 'stockPortfolioManager'
def version = "0.0.latest"
def dockerImageTag = "portfolioManager:latest"

pipeline {
  agent any

  stages {
     stage('Build docker image') {
          // this stage also builds and tests the Java project using Maven
          steps {
            sh "docker build -t portfolioManager ."
          }
      }
    stage('Deploy Container To Openshift') {
      steps {
        sh "oc login https://namdevops14.conygre.com:8443 --username admin --password admin --insecure-skip-tls-verify=true"
        sh "oc project portfolioManager || oc new-project portfolioManager"
        sh "oc delete all --selector app=portfolioManager || echo 'Unable to delete all previous openshift resources'"
        sh "oc new-app portfolioManager-l version=${version}"
        sh "oc expose svc/${projectName}"
      }
    }
  }
}