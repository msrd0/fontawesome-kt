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

/** Draw Polygon */
object FA_DRAW_POLYGON: Icon {
	
	override val name get() = "Draw Polygon"
	
	override val unicode get() = "f5ee"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384.3 352C419.5 352.2 448 380.7 448 416C448 451.3 419.3 480 384 480C360.3 480 339.6 467.1 328.6 448H119.4C108.4 467.1 87.69 480 64 480C28.65 480 0 451.3 0 416C0 392.3 12.87 371.6 32 360.6V151.4C12.87 140.4 0 119.7 0 96C0 60.65 28.65 32 64 32C87.69 32 108.4 44.87 119.4 64H328.6C339.6 44.87 360.3 32 384 32C419.3 32 448 60.65 448 96C448 131.3 419.5 159.8 384.3 159.1L345.5 227.9C349.7 236.4 352 245.9 352 256C352 266.1 349.7 275.6 345.5 284.1L384.3 352zM96 360.6C105.7 366.2 113.8 374.3 119.4 384H328.6C328.6 383.9 328.7 383.8 328.7 383.7L292.2 319.9C290.8 319.1 289.4 320 288 320C252.7 320 224 291.3 224 256C224 220.7 252.7 192 288 192C289.4 192 290.8 192 292.2 192.1L328.7 128.3L328.6 128H119.4C113.8 137.7 105.7 145.8 96 151.4L96 360.6z"/></svg>"""
		else -> null
	}
	
}
