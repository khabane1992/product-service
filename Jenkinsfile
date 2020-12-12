pipeline {
    agent any

    tools{
        maven 'maven363'
    }

    stages {
        stage('Get maven version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}