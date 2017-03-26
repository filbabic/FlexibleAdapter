# FlexibleAdapter
An extensible, generic, reusable and simple to use RecyclerView adapter implementation, requiring zero boilerplate code.

Prewritten for any kind of static view display, just create your own implementation of the FlexibleHolder<T>, the T being
an object listened in click events(if you want to use my Rx implementation). Then after receiving your dataset, transform it
into a list of FlexibleHolder implementations, and set them in the adapter!

The only things you have to provide are a layout inside the FlexibleHolder implementation, and the way of displaying it.
Using the reactive "click listener" is optional, but recommended, as it is a clean and simple way to handle click events.

To use just add a dependency: 

```
//this version contains RxJava and RxAndroid 2 as it's dependencies
compile 'com.github.filbabic:flexibleadapter:1.0.0' 
```

Because I realised there might be users who just don't want to add Rx due to dex limits, or other means of binding click events, I've also created an separate version with only the basic adapter and holder :

```
compile 'com.github.filbabic:flexibleadapter:1.0.1' 
```

and you're set!

Be sure to check out the sample usage of the adapter, with a single text view holder, and the click listener.
---

Copyright 2017 Filip Babić

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
