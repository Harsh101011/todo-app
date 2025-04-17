pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1' // Set this in Jenkins tools config
    }

    environment {
        GIT_CREDENTIALS_ID = 'github-credentials'
    }

    stages {
        stage('Checkout') {
            steps {
                git credentialsId: "${env.GIT_CREDENTIALS_ID}", url: 'https://github.com/Harsh101011/todo-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

                stage('Docker Build & Run') {
            steps {
                script {
                    def imageName = 'harsh101011/todo-app'

                    sh "docker build -t ${imageName} ."
                    sh "docker run -d -p 8081:8080 --name todo-container ${imageName}"
                }
            }
        }

    }
}
