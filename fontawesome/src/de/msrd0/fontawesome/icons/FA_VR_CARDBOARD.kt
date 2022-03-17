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

/** Cardboard VR */
object FA_VR_CARDBOARD: Icon {
	
	override val name get() = "Cardboard VR"
	
	override val unicode get() = "f729"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M576 64H64c-35.2 0-64 28.8-64 64v256c0 35.2 28.8 64 64 64l128.3 .0001c25.18 0 48.03-14.77 58.37-37.73l27.76-61.65c7.875-17.5 24-28.63 41.63-28.63s33.75 11.13 41.63 28.63l27.75 61.63c10.35 22.98 33.2 37.75 58.4 37.75L576 448c35.2 0 64-28.8 64-64v-256C640 92.8 611.2 64 576 64zM160 304c-35.38 0-64-28.63-64-64s28.62-63.1 64-63.1s64 28.62 64 63.1S195.4 304 160 304zM480 304c-35.38 0-64-28.63-64-64s28.62-63.1 64-63.1s64 28.62 64 63.1S515.4 304 480 304z"/></svg>"""
		else -> null
	}
	
}
