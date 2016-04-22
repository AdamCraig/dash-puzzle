apply plugin: 'java'
apply plugin: 'application'

archivesBaseName = "dash-puzzle"
version = '1.0'
mainClassName = "App"

repositories {
 mavenCentral()
}

dependencies {
  compile group: 'com.sparkjava', name: 'spark-core', version: '2.3'
  compile group: 'org.apache.velocity', name: 'velocity', version: '1.7'
  testCompile group: 'junit', name: 'junit', version: '4.+'
  testCompile group: 'org.fluentlenium', name: 'fluentlenium-core', version: '0.10.3'
  testCompile group: 'org.fluentlenium', name: 'fluentlenium-assertj', version: '0.10.3'
}
