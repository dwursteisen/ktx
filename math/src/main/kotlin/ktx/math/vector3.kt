package ktx.math

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3

/**
 * Constructs a new [Vector3] instance. Basically a "copy" of [Vector3] constructor that supports Kotlin syntax features:
 * named parameters with default values.
 * @param x the X component. Defaults to 0f.
 * @param y the Y component. Defaults to 0f.
 * @param z the Z component. Defaults to 0f.
 * @return a new [Vector3] instance storing the passed values.
 */
fun vec3(x: Float = 0f, y: Float = 0f, z: Float = 0f): Vector3 = Vector3(x, y, z)

/**
 * Constructs a new [Vector3] instance. Basically a "copy" of [Vector3] constructor that supports Kotlin syntax features:
 * named parameters with default values.
 * @param vector2 the X and Y components. Defaults to vec2(0f, 0f).
 * @param z the Z component. Defaults to 0f.
 * @return a new [Vector3] instance storing the passed values.
 */
fun vec3(vector2: Vector2, z: Float): Vector3 = Vector3(vector2, z)

/**
 * Constructs a new [Vector3] instance. Basically a "copy" of [Vector3] constructor that supports Kotlin syntax features:
 * named parameters with default values.
 * @param x the X component. Defaults to 0f.
 * @param vector2 the Y and Z components. Defaults to vec2(0f, 0f).
 * @return a new [Vector3] instance storing the passed values.
 */
fun vec3(x: Float, vector2: Vector2): Vector3 = Vector3(x, vector2.x, vector2.y)

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to x.
 */
var Vector3.s: Float
  get() = this.x
  set(value) { this.x = value}

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to y.
 */
var Vector3.t: Float
  get() = this.y
  set(value) { this.y = value}

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y).
 */
var Vector3.st: Vector2
  get() = Vector2(this.x, this.y)
  set(value) {
    this.x = value.x
    this.y = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, z).
 */
var Vector3.sb: Vector2
  get() = Vector2(this.x, this.z)
  set(value) {
    this.x = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, z).
 */
var Vector3.tb: Vector2
  get() = Vector2(this.y, this.z)
  set(value) {
    this.y = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y, z).
 */
var Vector3.stb: Vector3
  get() = Vector3(this.x, this.y, this.z)
  set(value) {
    this.x = value.x
    this.y = value.y
    this.z = value.z
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to x.
 */
var Vector3.r: Float
  get() = this.x
  set(value) { this.x = value}

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to y.
 */
var Vector3.g: Float
  get() = this.y
  set(value) { this.y = value}

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to z.
 */
var Vector3.b: Float
  get() = this.z
  set(value) { this.z = value}

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y).
 */
var Vector3.rg: Vector2
  get() = Vector2(x, y)
  set(value) {
    this.x = value.x
    this.y = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, z).
 */
var Vector3.rb: Vector2
  get() = Vector2(x, z)
  set(value) {
    this.x = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y).
 */
var Vector3.gb: Vector2
  get() = Vector2(y, z)
  set(value) {
    this.y = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec3(x, y, z).
 */
var Vector3.rgb: Vector3
  get() = Vector3(x, y, z)
  set(value) {
    this.x = value.x
    this.y = value.y
    this.z = value.z
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y).
 */
var Vector3.xy: Vector2
  get() = Vector2(x, y)
  set(value) {
    this.x = value.x
    this.y = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, z).
 */
var Vector3.xz: Vector2
  get() = Vector2(x, z)
  set(value) {
    this.x = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec2(x, y).
 */
var Vector3.yz: Vector2
  get() = Vector2(y, z)
  set(value) {
    this.y = value.x
    this.z = value.y
  }

/**
 * Swizzled coordinate property, like in GLSL.
 * Equals to vec3(x, y, z).
 */
var Vector3.xyz: Vector3
  get() = Vector3(x, y, z)
  set(value) {
    this.x = value.x
    this.y = value.y
    this.z = value.z
  }

/**
 * Inverts currently stored X, Y and Z values.
 * @return this vector for chaining.
 */
operator fun Vector3.unaryMinus(): Vector3 {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

/**
 * Converts this vector into a color object.
 * @return color
 */
fun Vector3.toColor(): Color = Color(this.x, this.y, this.z, 1f)

/**
 * @param vector3 values from this vector will be added to this vector.
 */
operator fun Vector3.plusAssign(vector3: Vector3) { this.add(vector3) }

/**
 * Modifies x and y components of this vector.
 * @param vector2 values from this vector will be added to this vector.
 */
operator fun Vector3.plusAssign(vector2: Vector2) {
  this.x += vector2.x
  this.y += vector2.y
}

/**
 * @param vector3 values from this vector will be subtracted from this vector.
 */
operator fun Vector3.minusAssign(vector3: Vector3) { this.sub(vector3) }

/**
 * Modifies x and y components of this vector.
 * @param vector2 values from this vector will be subtracted from this vector.
 */
operator fun Vector3.minusAssign(vector2: Vector2) {
  this.x -= vector2.x
  this.y -= vector2.y
}

/**
 * @param vector3 values from this vector will multiply this vector.
 */
operator fun Vector3.timesAssign(vector3: Vector3) { this.scl(vector3) }

/**
 * @param vector3 values from this vector will divide this vector.
 */
operator fun Vector3.divAssign(vector3: Vector3) {
  this.x /= vector3.x
  this.y /= vector3.y
  this.z /= vector3.z
}

/**
 * @param scalar will be used to multiply all vector values.
 */
operator fun Vector3.timesAssign(scalar: Float) { this.scl(scalar) }

/**
 * @param scalar will be used to divide all vector values.
 */
operator fun Vector3.divAssign(scalar: Float) {
  this.x /= scalar
  this.y /= scalar
  this.z /= scalar
}

/**
 * @param scalar will be used to multiply all vector values.
 */
operator fun Vector3.timesAssign(scalar: Int) { this.scl(scalar.toFloat()) }

/**
 * @param scalar will be used to divide all vector values.
 */
operator fun Vector3.divAssign(scalar: Int) {
  this.x /= scalar
  this.y /= scalar
  this.z /= scalar
}

/**
 * @param vector3 values from this vector will be added to this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.plus(vector3: Vector3): Vector3
        = Vector3(this.x + vector3.x, this.y + vector3.y, this.z + vector3.z)

/**
 * Modifies x and y components of this vector.
 * @param vector2 values from this vector will be added to this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.plus(vector2: Vector2): Vector3
        = Vector3(this.x + vector2.x, this.y + vector2.y, this.z)

/**
 * @param vector3 values from this vector will be subtracted from this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.minus(vector3: Vector3): Vector3
        = Vector3(this.x - vector3.x, this.y - vector3.y, this.z - vector3.z)

/**
 * Modifies x and y components of this vector.
 * @param vector2 values from this vector will be subtracted from this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.minus(vector2: Vector2): Vector3
        = Vector3(this.x - vector2.x, this.y - vector2.y, this.z)

/**
 * @param vector3 values from this vector will multiply this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.times(vector3: Vector3): Vector3
        = Vector3(this.x * vector3.x, this.y * vector3.y, this.z * vector3.z)

/**
 * @param vector3 values from this vector will divide this vector.
 * @return this vector for chaining.
 */
operator fun Vector3.div(vector3: Vector3): Vector3
        = Vector3(this.x / vector3.x, this.y / vector3.y, this.z / vector3.z)

/**
 * @param scalar will be used to multiply all vector values.
 * @return this vector for chaining.
 */
operator fun Vector3.times(scalar: Float): Vector3
        = Vector3(this.x * scalar, this.y * scalar, this.z * scalar)

/**
 * @param scalar will be used to divide all vector values.
 * @return this vector for chaining.
 */
operator fun Vector3.div(scalar: Float): Vector3
        = Vector3(this.x / scalar, this.y / scalar, this.z / scalar)

/**
 * @param scalar will be used to multiply all vector values.
 * @return this vector for chaining.
 */
operator fun Vector3.times(scalar: Int): Vector3
        = Vector3(this.x * scalar, this.y * scalar, this.z * scalar)

/**
 * @param scalar will be used to divide all vector values.
 * @return this vector for chaining.
 */
operator fun Vector3.div(scalar: Int): Vector3
        = Vector3(this.x / scalar, this.y / scalar, this.z / scalar)

/**
 * Increments all vector values - adds 1 to x, y and z. Note that since [Vector3] is mutable and its instances are usually
 * reused, this operation DOES NOT create a new [Vector3] or keep its previous state. That means that both vector++ and
 * ++vector have the same effect and both will modify the internal state of the vector.
 * @return this vector for chaining.
 */
operator fun Vector3.inc(): Vector3 = this.add(1f, 1f, 1f)

/**
 * Decrements all vector values - subtracts 1 from x, y and z. Note that since [Vector3] is mutable and its instances are
 * usually reused, this operation DOES NOT create a new [Vector3] or keep its previous state. That means that both
 * vector-- and --vector have the same effect and both will modify the internal state of the vector.
 * @return this vector for chaining.
 */
operator fun Vector3.dec(): Vector3 = this.sub(1f, 1f, 1f)

/**
 * Operator function that allows to deconstruct this vector.
 * @return X component.
 */
operator fun Vector3.component1(): Float = this.x

/**
 * Operator function that allows to deconstruct this vector.
 * @return Y component.
 */
operator fun Vector3.component2(): Float = this.y

/**
 * Operator function that allows to deconstruct this vector.
 * @return Z component.
 */
operator fun Vector3.component3(): Float = this.z

/**
 * Allows to compare which [Vector3] has greater overall length.
 * @param vector3 will be compared to this vector.
 * @return 1 if this vector has greater length. 0 if vectors are equal. -1 if the other vector is greater.
 */
operator fun Vector3.compareTo(vector3: Vector3): Int = this.len2().compareTo(vector3.len2())

/**
 * Custom operator to apply dot multiplication.
 * @param vector3 will be used to calculate the dot product of this vector.
 * @return dot product.
 */
infix fun Vector3.dot(vector3: Vector3): Float = this.dot(vector3)

/**
 * Custom operator to apply cross multiplication.
 * @param vector3 will be used to calculate the cross product of this vector.
 * @return cross product.
 */
infix fun Vector3.x(vector3: Vector3): Vector3
        = Vector3(y * vector3.z - z * vector3.y, z * vector3.x - x * vector3.z, x * vector3.y - y * vector3.x)