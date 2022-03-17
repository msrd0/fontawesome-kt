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

/** Peseta Sign */
object FA_PESETA_SIGN: Icon {
	
	override val name get() = "Peseta Sign"
	
	override val unicode get() = "e221"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M192 32C269.4 32 333.1 86.97 348.8 160H352C369.7 160 384 174.3 384 192C384 209.7 369.7 224 352 224H348.8C333.1 297 269.4 352 192 352H96V448C96 465.7 81.67 480 64 480C46.33 480 32 465.7 32 448V224C14.33 224 0 209.7 0 192C0 174.3 14.33 160 32 160V64C32 46.33 46.33 32 64 32H192zM282.5 160C269.4 122.7 233.8 96 192 96H96V160H282.5zM96 224V288H192C233.8 288 269.4 261.3 282.5 224H96z"/></svg>"""
		else -> null
	}
	
}
