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

/** Crutch */
object FA_CRUTCH: Icon {
	
	override val name get() = "Crutch"
	
	override val unicode get() = "f7f7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502.6 168.1l-159.6-159.5c-12.54-12.54-32.85-12.6-45.46-.1256c-12.68 12.54-12.73 33.1-.1256 45.71l159.6 159.5c12.6 12.59 33.03 12.57 45.59-.0628C515.1 201.9 515.1 181.5 502.6 168.1zM334.4 245.4l-67.88-67.87l55.13-55.12l-45.25-45.25L166.7 186.8C154.1 199.6 145.2 215.6 141.1 233.2L113.3 353.4l-108.6 108.6c-6.25 6.25-6.25 16.37 0 22.62l22.63 22.62c6.25 6.25 16.38 6.25 22.63 0l108.6-108.6l120.3-27.75c17.5-4.125 33.63-13 46.38-25.62l109.6-109.7l-45.25-45.25L334.4 245.4zM279.9 300.1C275.7 304.2 270.3 307.2 264.4 308.6l-79.25 18.25l18.25-79.25c1.375-5.875 4.375-11.25 8.5-15.5l9.375-9.25l67.88 67.87L279.9 300.1z"/></svg>"""
		else -> null
	}
	
}
