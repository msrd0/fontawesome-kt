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

object FA_CENT_SIGN: Icon {
	
	override val name get() = "Cent Sign"
	
	override val unicode get() = "e3f5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M192 0C209.7 0 224 14.33 224 32V66.66C254.9 71.84 283.2 84.39 307.2 102.4C321.4 113 324.2 133.1 313.6 147.2C302.1 161.4 282.9 164.2 268.8 153.6C247.4 137.5 220.9 128 192 128C121.3 128 64 185.3 64 256C64 326.7 121.3 384 192 384C220.9 384 247.4 374.5 268.8 358.4C282.9 347.8 302.1 350.6 313.6 364.8C324.2 378.9 321.4 398.1 307.2 409.6C283.2 427.6 254.9 440.2 224 445.3V480C224 497.7 209.7 512 192 512C174.3 512 160 497.7 160 480V445.3C69.19 430.1 0 351.1 0 256C0 160.9 69.19 81.89 160 66.66V32C160 14.33 174.3 .0006 192 .0006V0z"/></svg>"""
		else -> null
	}
	
}
