# iOS


## Steps to build iOS sample of CUEAudio/sdk_demo_reactnative

First, follow all the initial steps from the README of the native iOS SDK demo (here: [ObjC](https://github.com/CUEAudio/sdk_demo_ios_objc/blob/main/README.md), [Swift](https://github.com/CUEAudio/sdk_demo_ios/blob/main/README.md), [SPM](https://github.com/CUEAudio/sdk_demo_ios_spm/blob/main/README.md)).

Next, follow the steps below, which are specific to React Native implementations. 


Open Terminal and run one by one the following commands:

```
git clone https://github.com/CUEAudio/sdk_demo_reactnative.git
cd ./sdk_demo_reactnative
yarn
cd ./ios
rm Podfile.lock
pod install
```

Results of pod install should show something like the following: 
<img width="588" alt="Screenshot 2024-11-15 at 8 42 02 AM" src="https://github.com/user-attachments/assets/37a5c7e0-c38e-4731-994e-d78e1e2caffe">

Open the `xcworkspace` file in XCode (tested in Xcode version 15.4) -- specifically `sdk_demo_reactnative/ios/LightShowRN.xcworkspace` *(not the .xcodeproj)*.

Select correct value for Team at Signing & Capabilities: 
<img width="578" alt="Screenshot 2024-11-15 at 8 43 00 AM" src="https://github.com/user-attachments/assets/69bd9fed-8ca7-435e-8516-213cfdb6f537">

Set up for target LightShowRN minimal iOS version 13: 
<img width="575" alt="Screenshot 2024-11-15 at 8 43 18 AM" src="https://github.com/user-attachments/assets/57a22753-5e0b-484f-9c27-f0a4012594b2">

Try to build the project in XCode.

In case of error in Yoga file fix it by pressing “Fix” button: 
<img width="564" alt="Screenshot 2024-11-15 at 8 43 40 AM" src="https://github.com/user-attachments/assets/cba77920-0090-4acc-8866-aab444f7d259">


Try to build the project in XCode again. This time it should finish successfully.


# Android

Follow the integration steps in our [native Android SDK demo](https://github.com/CUEAudio/sdk_demo_android/blob/main/README.md). 


