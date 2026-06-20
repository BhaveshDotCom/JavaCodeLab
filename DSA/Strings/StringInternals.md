### Java String Internals

In the internal implementation of String (Java 9+):

value → Stores the actual string data as a byte[] array.

coder → Stores which encoding is used for value.

0 → LATIN1 (1 byte/character) ASCII

1 → UTF16 (2 bytes/character)

hash → Stores the cached hash code returned by hashCode(). It is computed once and reused.

hashIsZero → A boolean flag indicating that hashCode() has already been computed and its result is actually 0.

#### Why hashIsZero is needed?

hash is initialized to 0 by default. If a string's real hash code is also 0, Java cannot distinguish between:

0 because hash hasn't been computed yet 

0 because the actual hash code is 0

So hashIsZero removes this ambiguity.
