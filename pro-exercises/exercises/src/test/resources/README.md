use-try

# Exercise 24 > Use Try

- Take a look at the documentation of `Play Json`

- Add a `toJson` method to `Time`

  - Return a `JsValue` representing this `Time`

- Add a `fromJson` method to the `Time` companion object

  - Add a parameter of type `JsValue`
  - Wrap the conversion of the `JsValue` with `Try`(s)
  - If parsing the `hours` fails, the attempt to parse the object should be
    considered a failure
  - If parsing the `minutes` fails, use 0 as the default value for `minutes`
  - Return an `Option` of `Time`: If it was a `Success`, wrap the `Time` in
    `Some`, in case of `Failure` return `None`

- Use the `test` command to verify the solution works as expected.

- Congratulations - You've completed the Lightbend Scala Language - Professional course !