Welcome to TestLibrary :)
===================


# TestLibrary

TestLibrary is an android library used for displaying Toast messages.

## Installation

In the project-level gradle under allProjects add jitpack()

```bash
 maven { url 'https://jitpack.io' }
```
In the app-level gradle add the dependencies
```bash
implementation ‘com.github.GeorgeCodewell:library:0.1.0’
```
## Usage

```android
import com.example.mylibrary.ToastMessage;

 ToastMessage.s(CONTEXT, "Cheers!");
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
//


----------
