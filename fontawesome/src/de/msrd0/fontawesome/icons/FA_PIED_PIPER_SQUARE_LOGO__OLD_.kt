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
import de.msrd0.fontawesome.Style.BRANDS

object FA_PIED_PIPER_SQUARE_LOGO__OLD_: Icon {
	
	override val name get() = "Pied Piper Square Logo (Old)"
	
	override val unicode get() = "e01e"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M32 419L0 479.2l.8-328C.8 85.3 54 32 120 32h327.2c-93 28.9-189.9 94.2-253.9 168.6C122.7 282 82.6 338 32 419M448 32S305.2 98.8 261.6 199.1c-23.2 53.6-28.9 118.1-71 158.6-28.9 27.8-69.8 38.2-105.3 56.3-23.2 12-66.4 40.5-84.9 66h328.4c66 0 119.3-53.3 119.3-119.2-.1 0-.1-328.8-.1-328.8z"/></svg>"""
		else -> null
	}
	
}
