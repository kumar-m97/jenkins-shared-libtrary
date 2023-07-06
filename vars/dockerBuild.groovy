def call(){
	sh 'docker build . -t app-server:v${env.BUILD_ID}'
	sh 'docker tag app-server:v${BUILD_NUMBER} kumarmlive/kumar:v${env.BUILD_ID}'
	sh 'docker push kumarmlive/kumar:v${env.BUILD_ID}'
}
