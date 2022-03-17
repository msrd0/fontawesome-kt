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

/** Jet fighter */
object FA_JET_FIGHTER: Icon {
	
	override val name get() = "Jet fighter"
	
	override val unicode get() = "f0fb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M160 24C160 10.75 170.7 0 184 0H296C309.3 0 320 10.75 320 24C320 37.25 309.3 48 296 48H280L384 192H500.4C508.1 192 515.7 193.4 522.9 196.1L625 234.4C634 237.8 640 246.4 640 256C640 265.6 634 274.2 625 277.6L522.9 315.9C515.7 318.6 508.1 320 500.4 320H384L280 464H296C309.3 464 320 474.7 320 488C320 501.3 309.3 512 296 512H184C170.7 512 160 501.3 160 488C160 474.7 170.7 464 184 464H192V320H160L105.4 374.6C99.37 380.6 91.23 384 82.75 384H64C46.33 384 32 369.7 32 352V288C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224V160C32 142.3 46.33 128 64 128H82.75C91.23 128 99.37 131.4 105.4 137.4L160 192H192V48H184C170.7 48 160 37.25 160 24V24zM80 240C71.16 240 64 247.2 64 256C64 264.8 71.16 272 80 272H144C152.8 272 160 264.8 160 256C160 247.2 152.8 240 144 240H80z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_JET_FIGHTER]. */
val FA_FIGHTER_JET = FA_JET_FIGHTER
