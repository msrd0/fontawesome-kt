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

object FA_SCISSORS: Icon {
	
	override val name get() = "Scissors"
	
	override val unicode get() = "f0c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M396.8 51.2C425.1 22.92 470.9 22.92 499.2 51.2C506.3 58.27 506.3 69.73 499.2 76.8L216.5 359.5C221.3 372.1 224 385.7 224 400C224 461.9 173.9 512 112 512C50.14 512 0 461.9 0 400C0 338.1 50.14 287.1 112 287.1C126.3 287.1 139.9 290.7 152.5 295.5L191.1 255.1L152.5 216.5C139.9 221.3 126.3 224 112 224C50.14 224 0 173.9 0 112C0 50.14 50.14 0 112 0C173.9 0 224 50.14 224 112C224 126.3 221.3 139.9 216.5 152.5L255.1 191.1L396.8 51.2zM160 111.1C160 85.49 138.5 63.1 112 63.1C85.49 63.1 64 85.49 64 111.1C64 138.5 85.49 159.1 112 159.1C138.5 159.1 160 138.5 160 111.1zM112 448C138.5 448 160 426.5 160 400C160 373.5 138.5 352 112 352C85.49 352 64 373.5 64 400C64 426.5 85.49 448 112 448zM278.6 342.6L342.6 278.6L499.2 435.2C506.3 442.3 506.3 453.7 499.2 460.8C470.9 489.1 425.1 489.1 396.8 460.8L278.6 342.6z"/></svg>"""
		else -> null
	}
	
}

val FA_CUT = FA_SCISSORS
