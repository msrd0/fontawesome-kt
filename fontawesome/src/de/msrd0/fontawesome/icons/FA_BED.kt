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

/** Bed */
object FA_BED: Icon {
	
	override val name get() = "Bed"
	
	override val unicode get() = "f236"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M176 288C220.1 288 256 252.1 256 208S220.1 128 176 128S96 163.9 96 208S131.9 288 176 288zM544 128H304C295.2 128 288 135.2 288 144V320H64V48C64 39.16 56.84 32 48 32h-32C7.163 32 0 39.16 0 48v416C0 472.8 7.163 480 16 480h32C56.84 480 64 472.8 64 464V416h512v48c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16V224C640 170.1 597 128 544 128z"/></svg>"""
		else -> null
	}
	
}
