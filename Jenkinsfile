pipeline {
    agent any
    tools{
        maven 'Maven 3.9'
    }

    stages {
        stage('build') {
            steps {
                echo 'Building the project'
            }
        }

        stage('test') {
            steps {
                echo 'Testing the project'
            }
        }

        stage('deploy') {
            steps {
                echo 'Deploying the project'
            }
        }
    }


}