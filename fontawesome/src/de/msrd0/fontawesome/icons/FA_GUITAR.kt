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

/** Guitar */
object FA_GUITAR: Icon {
	
	override val name get() = "Guitar"
	
	override val unicode get() = "f7a6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502.7 39.02L473 9.37c-12.5-12.5-32.74-12.49-45.24 .0106l-46.24 46.37c-3.875 3.875-6.848 8.506-8.598 13.76l-12.19 36.51L284.5 182.3C272.4 173.5 259 166.5 244.4 163.1C211 155.4 177.4 162.3 154.5 185.1C145.3 194.5 138.3 206 134.3 218.6C128.3 237.1 111.1 251.3 92.14 253C68.52 255.4 46.39 264.5 29.52 281.5c-45.62 45.5-37.38 127.5 18.12 183c55.37 55.38 137.4 63.51 182.9 18c16.1-16.88 26.25-38.85 28.5-62.72c1.75-18.75 15.84-36.16 34.47-42.16c12.5-3.875 24.03-10.87 33.4-20.25c22.87-22.88 29.75-56.38 21.1-89.76c-3.375-14.63-10.39-27.99-19.14-40.11l76.25-76.26l36.53-12.17c5.125-1.75 9.894-4.715 13.77-8.59l46.36-46.29C515.2 71.72 515.2 51.52 502.7 39.02zM208 352c-26.5 0-48-21.5-48-48c0-26.5 21.5-48 48-48s47.1 21.5 47.1 48C256 330.5 234.5 352 208 352z"/></svg>"""
		else -> null
	}
	
}
