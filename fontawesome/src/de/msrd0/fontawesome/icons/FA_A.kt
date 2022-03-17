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

/** A */
object FA_A: Icon {
	
	override val name get() = "A"
	
	override val unicode get() = "41"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M381.5 435.7l-160-384C216.6 39.78 204.9 32.01 192 32.01S167.4 39.78 162.5 51.7l-160 384c-6.797 16.31 .9062 35.05 17.22 41.84c16.38 6.828 35.08-.9219 41.84-17.22l31.8-76.31h197.3l31.8 76.31c5.109 12.28 17.02 19.7 29.55 19.7c4.094 0 8.266-.7969 12.3-2.484C380.6 470.7 388.3 452 381.5 435.7zM119.1 320L192 147.2l72 172.8H119.1z"/></svg>"""
		else -> null
	}
	
}
