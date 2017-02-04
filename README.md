# FlexibleAdapter
An extensible, generic, reusable and simple to use RecyclerView adapter implementation, requiring zero boilerplate code.

Prewritten for any kind of static view display, just create your own implementation of the FlexibleHolder<T>, the T being
an object listened in click events(if you want to use my Rx implementation). Then after receiving your dataset, transform it
into a list of FlexibleHolder implementations, and set them in the adapter!

The only things you have to provide are a layout inside the FlexibleHolder implementation, and the way of displaying it.
Using the reactive "click listener" is optional, but recommended, as it is a clean and simple way to handle click events.
