pipeline {
    agent: any
    tools{
        maven 'Maven 3.9'
    }

    stages {
        stage('build') {
            sh "echo 'Building the project'"
        }

        stage('test') {
            sh "echo 'Testing the project'"
        }

        stage('deploy') {
            sh "echo 'Deploying the project'"
        }
    }


}