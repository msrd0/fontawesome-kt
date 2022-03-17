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

object FA_LUNGS: Icon {
	
	override val name get() = "Lungs"
	
	override val unicode get() = "f604"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M640 419.8c0 61.25-62.5 105.5-125.3 88.63l-59.53-15.88c-42.12-11.38-71.25-47.5-71.25-88.63L384 316.4l85.88 57.25c3.625 2.375 8.625 1.375 11-2.25l8.875-13.37c2.5-3.625 1.5-8.625-2.125-11L320 235.3l-167.6 111.8c-1.75 1.125-3 3-3.375 5c-.375 2.125 0 4.25 1.25 6l8.875 13.37c1.125 1.75 3 3 5 3.375c2.125 .375 4.25 0 6-1.125L256 316.4l.0313 87.5c0 41.13-29.12 77.25-71.25 88.63l-59.53 15.88C62.5 525.3 0 481 0 419.8c0-10 1.25-19.88 3.875-29.63C25.5 308.9 59.91 231 105.9 159.1c22.12-34.63 36.12-63.13 80.12-63.13C224.7 96 256 125.4 256 161.8v60.1l32.88-21.97C293.4 196.9 296 192 296 186.6V16C296 7.125 303.1 0 312 0h16c8.875 0 16 7.125 16 16v170.6c0 5.375 2.625 10.25 7.125 13.25L384 221.8v-60.1c0-36.38 31.34-65.75 69.97-65.75c43.1 0 58 28.5 80.13 63.13c46 71.88 80.41 149.8 102 231C638.8 399.9 640 409.8 640 419.8z"/></svg>"""
		else -> null
	}
	
}
