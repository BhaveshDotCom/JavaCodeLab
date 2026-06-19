/*
values(): Compiler-generated method. Returns an array containing all enum constants in the order they were declared.

valueOf(String name): Compiler-generated method. Converts a String to its corresponding enum constant. Internally calls Enum.valueOf(Class, String).

name(): Returns the exact name of the enum constant as declared.

ordinal(): Returns the position (index) of the enum constant, starting from 0.

toString(): Returns the string representation of the enum constant. By default, it is the same as name(), but it can be overridden.

compareTo(Enum e): Compares two enum constants based on their declaration order.

getDeclaringClass(): Returns the Class object representing the enum type.

equals(Object obj): Checks whether two enum references refer to the same constant.

hashCode(): Returns the hash code of the enum constant.

clone(): Prevents enum objects from being cloned (protected and final).

valueOf(Class<T>, String): Static method in java.lang.Enum that returns the enum constant of the specified enum class.
*/