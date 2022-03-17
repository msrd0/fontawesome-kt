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

/** Cruzeiro Sign */
object FA_CRUZEIRO_SIGN: Icon {
	
	override val name get() = "Cruzeiro Sign"
	
	override val unicode get() = "e152"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M159.1 402.7V256C159.1 238.3 174.3 224 191.1 224C199.7 224 206.8 226.7 212.3 231.3C223 226.6 234.8 224 247.3 224C264.5 224 281.3 229.1 295.7 238.7L305.8 245.4C320.5 255.2 324.4 275 314.6 289.8C304.8 304.5 284.1 308.4 270.2 298.6L260.2 291.9C256.3 289.4 251.9 288 247.3 288C234.4 288 224 298.4 224 311.3V416C264.1 416 302.3 400.6 330.7 375.3C343.8 363.5 364.1 364.6 375.8 377.8C387.6 390.9 386.5 411.2 373.3 422.1C333.7 458.4 281.4 480 224 480C100.3 480 0 379.7 0 256C0 132.3 100.3 32 224 32C281.4 32 333.7 53.59 373.3 89.04C386.5 100.8 387.6 121.1 375.8 134.2C364.1 147.4 343.8 148.5 330.7 136.7C302.3 111.4 264.1 96 224 96C135.6 96 63.1 167.6 63.1 256C63.1 321.6 103.5 377.1 159.1 402.7V402.7z"/></svg>"""
		else -> null
	}
	
}
