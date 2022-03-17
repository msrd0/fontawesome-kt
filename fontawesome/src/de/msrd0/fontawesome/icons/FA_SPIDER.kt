/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Spider */
object FA_SPIDER: Icon {
	
	override val name get() = "Spider"
	
	override val unicode get() = "f717"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M563.3 401.6c2.608 8.443-2.149 17.4-10.62 19.1l-15.35 4.709c-8.48 2.6-17.47-2.139-20.08-10.59L493.2 338l-79.79-31.8l53.47 62.15c5.08 5.904 6.972 13.89 5.08 21.44l-28.23 110.1c-2.151 8.57-10.87 13.78-19.47 11.64l-15.58-3.873c-8.609-2.141-13.84-10.83-11.69-19.4l25.2-98.02l-38.51-44.77c.1529 2.205 .6627 4.307 .6627 6.549c0 53.02-43.15 96-96.37 96S191.6 405 191.6 352c0-2.242 .5117-4.34 .6627-6.543l-38.51 44.76l25.2 98.02c2.151 8.574-3.084 17.26-11.69 19.4l-15.58 3.873c-8.603 2.141-17.32-3.072-19.47-11.64l-28.23-110.1c-1.894-7.543 0-15.53 5.08-21.44l53.47-62.15l-79.79 31.8l-24.01 77.74c-2.608 8.447-11.6 13.19-20.08 10.59l-15.35-4.709c-8.478-2.6-13.23-11.55-10.63-19.1l27.4-88.69c2.143-6.939 7.323-12.54 14.09-15.24L158.9 256l-104.7-41.73C47.43 211.6 42.26 205.1 40.11 199.1L12.72 110.4c-2.608-8.443 2.149-17.4 10.62-19.1l15.35-4.709c8.48-2.6 17.47 2.139 20.08 10.59l24.01 77.74l79.79 31.8L109.1 143.6C104 137.7 102.1 129.7 104 122.2l28.23-110.1c2.151-8.57 10.87-13.78 19.47-11.64l15.58 3.873C175.9 6.494 181.1 15.18 178.1 23.76L153.8 121.8L207.7 184.4l.1542-24.44C206.1 123.4 228.9 91.77 261.4 80.43c5.141-1.793 10.5 2.215 10.5 7.641V112h32.12V88.09c0-5.443 5.394-9.443 10.55-7.641C345.9 91.39 368.3 121 368.3 155.9c0 1.393-.1786 2.689-.2492 4.064L368.3 184.4l53.91-62.66l-25.2-98.02c-2.151-8.574 3.084-17.26 11.69-19.4l15.58-3.873c8.603-2.141 17.32 3.072 19.47 11.64l28.23 110.1c1.894 7.543 0 15.53-5.08 21.44l-53.47 62.15l79.79-31.8l24.01-77.74c2.608-8.447 11.6-13.19 20.08-10.59l15.35 4.709c8.478 2.6 13.23 11.55 10.63 19.1l-27.4 88.69c-2.143 6.939-7.323 12.54-14.09 15.24L417.1 256l104.7 41.73c6.754 2.691 11.92 8.283 14.07 15.21L563.3 401.6z"/></svg>"""
		else -> null
	}
	
}
