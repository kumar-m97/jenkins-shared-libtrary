def call() {
	//sh "docker build . -t app-server:v${env.BUILD_ID}"
	//dockerImage = sh "docker tag app-server:v${env.BUILD_ID} kumarmlive/kumar:v${env.BUILD_ID}"
	//sh "docker push kumarmlive/kumar:v${env.BUILD_ID}"
	dockerImage = docker.build("kumarmlive/kumar:50")
	dockerImage.push()
}
