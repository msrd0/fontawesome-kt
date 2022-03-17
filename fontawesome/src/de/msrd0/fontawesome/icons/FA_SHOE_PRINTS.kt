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

object FA_SHOE_PRINTS: Icon {
	
	override val name get() = "Shoe Prints"
	
	override val unicode get() = "f54b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M192 159.1L224 159.1V32L192 32c-35.38 0-64 28.62-64 63.1S156.6 159.1 192 159.1zM0 415.1c0 35.37 28.62 64.01 64 64.01l32-.0103v-127.1l-32-.0005C28.62 351.1 0 380.6 0 415.1zM337.5 287.1c-35 0-76.25 13.12-104.8 31.1C208 336.4 188.3 351.1 128 351.1v128l57.5 15.98c26.25 7.25 53 13.13 80.38 15.01c32.63 2.375 65.63 .743 97.5-6.132C472.9 481.2 512 429.2 512 383.1C512 319.1 427.9 287.1 337.5 287.1zM491.4 7.252c-31.88-6.875-64.88-8.625-97.5-6.25C366.5 2.877 339.8 8.752 313.5 16L256 32V159.1c60.25 0 80 15.62 104.8 31.1c28.5 18.87 69.75 31.1 104.8 31.1C555.9 223.1 640 191.1 640 127.1C640 82.75 600.9 30.75 491.4 7.252z"/></svg>"""
		else -> null
	}
	
}
