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

/** Trademark */
object FA_TRADEMARK: Icon {
	
	override val name get() = "Trademark"
	
	override val unicode get() = "f25c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M618.1 97.67c-13.02-4.375-27.45 .1562-35.72 11.16L464 266.7l-118.4-157.8c-8.266-11.03-22.64-15.56-35.72-11.16C296.8 102 288 114.2 288 128v256c0 17.69 14.33 32 32 32s32-14.31 32-32v-160l86.41 115.2c12.06 16.12 39.13 16.12 51.19 0L576 224v160c0 17.69 14.33 32 32 32s32-14.31 32-32v-256C640 114.2 631.2 102 618.1 97.67zM224 96.01H32c-17.67 0-32 14.31-32 32s14.33 32 32 32h64v223.1c0 17.69 14.33 31.99 32 31.99s32-14.3 32-31.99V160h64c17.67 0 32-14.31 32-32S241.7 96.01 224 96.01z"/></svg>"""
		else -> null
	}
	
}
