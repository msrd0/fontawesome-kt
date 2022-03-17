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

/** Franc Sign */
object FA_FRANC_SIGN: Icon {
	
	override val name get() = "Franc Sign"
	
	override val unicode get() = "e18f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M288 32C305.7 32 320 46.33 320 64C320 81.67 305.7 96 288 96H112V192H256C273.7 192 288 206.3 288 224C288 241.7 273.7 256 256 256H112V320H192C209.7 320 224 334.3 224 352C224 369.7 209.7 384 192 384H112V448C112 465.7 97.67 480 80 480C62.33 480 48 465.7 48 448V384H32C14.33 384 0 369.7 0 352C0 334.3 14.33 320 32 320H48V64C48 46.33 62.33 32 80 32H288z"/></svg>"""
		else -> null
	}
	
}
