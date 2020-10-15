# Binora External Extras


## Usage

Add to your root build.gradle:
```Groovy
allprojects {
	repositories {
	...
	maven { url "https://jitpack.io" }
	}
}
```

Add the dependency:
```Groovy
dependencies {
	implementation 'com.github.apps-in:Binora-External-Extras:Version'
}
```

See EcgDemo.java for ECG parameters description