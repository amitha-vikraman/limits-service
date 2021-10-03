pipeline {
    agent any

stages{
        stage('Build'){
            steps {
              withMaven(maven:myLocalMaven) {
                bat 'mvn clean package'
              }
            }
        }
        stage('Test'){
            steps {
              withMaven(maven:myLocalMaven) {
                bat 'mvn test'
              }
            }
        }
        stage('Deploy'){
            steps {
              withMaven(maven:myLocalMaven) {
                bat 'mvn deploy'
              }
            }
        }
    }
}
