def call() {
	dockerImage = docker.build("kumarmlive/kumar:v${env.BUILD_ID}")
	docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
	dockerImage.push()
	}
}
