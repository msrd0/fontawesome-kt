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
import de.msrd0.fontawesome.Style.REGULAR

/** Face grin squint */
object FA_FACE_GRIN_SQUINT: Icon {
	
	override val name get() = "Face grin squint"
	
	override val unicode get() = "f585"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM256.3 331.8C208.9 331.8 164.1 324.9 124.5 312.8C112.2 309 100.2 319.7 105.2 331.5C130.1 390.6 188.4 432 256.3 432C324.2 432 382.4 390.6 407.4 331.5C412.4 319.7 400.4 309 388.1 312.8C348.4 324.9 303.7 331.8 256.3 331.8H256.3zM133.5 146.7C125.6 142.4 116 148.2 116 157.1C116 159.9 116.1 162.6 118.8 164.8L154.8 208L118.8 251.2C116.1 253.4 116 256.1 116 258.9C116 267.8 125.6 273.6 133.5 269.3L223.4 221.4C234.1 215.7 234.1 200.3 223.4 194.6L133.5 146.7zM396 157.1C396 148.2 386.4 142.4 378.5 146.7L288.6 194.6C277.9 200.3 277.9 215.7 288.6 221.4L378.5 269.3C386.4 273.6 396 267.8 396 258.9C396 256.1 395 253.4 393.2 251.2L357.2 208L393.2 164.8C395 162.6 396 159.9 396 157.1V157.1z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M349.5 308.4C368.2 303.1 385.4 320.4 374.1 336.5C350.4 374.6 306.3 399.1 255.9 399.1C205.6 399.1 161.5 374.6 136.9 336.5C126.5 320.4 143.7 303.1 162.3 308.4C191.3 315.1 222.8 318.8 255.9 318.8C289 318.8 320.6 315.1 349.5 308.4zM223.4 194.6C234.1 200.3 234.1 215.7 223.4 221.4L133.5 269.3C125.6 273.6 116 267.8 116 258.9C116 256.1 116.1 253.4 118.8 251.2L154.8 208L118.8 164.8C116.1 162.6 116 159.9 116 157.1C116 148.2 125.6 142.4 133.5 146.7L223.4 194.6zM393.2 164.8L357.2 208L393.2 251.2C395 253.4 396 256.1 396 258.9C396 267.8 386.4 273.6 378.5 269.3L288.6 221.4C277.9 215.7 277.9 200.3 288.6 194.6L378.5 146.7C386.4 142.4 396 148.2 396 157.1C396 159.9 395 162.6 393.2 164.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_GRIN_SQUINT]. */
val FA_GRIN_SQUINT = FA_FACE_GRIN_SQUINT
