# FancyToast
> Step 1. Add the JitPack repository to your build file

gradle

allprojects {
	repositories {
	maven { url 'https://jitpack.io' }
	}
	}
	
 ...
 
  > Step 2. Add the dependency
  
  val release_Version='1.0.0'
  
gradle
  
 dependencies {
	    implementation 'com.github.amitmahaseth:FancyToast:$release_Version'
	}
