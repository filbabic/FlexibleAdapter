# FlexibleAdapter
An extensible, generic, reusable and simple to use RecyclerView adapter implementation, requiring zero boilerplate code.

Prewritten for any kind of static view display, just create your own implementation of the FlexibleHolder<T>, the T being
an object listened in click events(if you want to use my Rx implementation). Then after receiving your dataset, transform it
into a list of FlexibleHolder implementations, and set them in the adapter!

The only things you have to provide are a layout inside the FlexibleHolder implementation, and the way of displaying it.
Using the reactive "click listener" is optional, but recommended, as it is a clean and simple way to handle click events.

To use just add a dependency: 

```
compile 'com.github.filbabic:flexibleadapter:0.0.1' 

```
and you're set!

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
