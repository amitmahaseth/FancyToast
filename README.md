# FancyToast
 
&#x1F535; Add the JitPack repository to your build file

gradle

allprojects {
	repositories {
	maven { url 'https://jitpack.io' }
	}
	}
	
 ...
 
  &#x1F535; Add the dependency
  
  val release_Version='1.0.0'
  
gradle
  
 dependencies {
	    implementation "com.github.amitmahaseth:FancyToast:$release_Version"
	}

...

 > Step 3
 
 -----Use this method for simple toast----
 
```diff
+> StylishToaster.simpleToast(Context,message)
```
  ....
