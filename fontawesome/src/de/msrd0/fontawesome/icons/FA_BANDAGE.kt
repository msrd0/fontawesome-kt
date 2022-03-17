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

/** Bandage */
object FA_BANDAGE: Icon {
	
	override val name get() = "Bandage"
	
	override val unicode get() = "f462"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M480 96H576C611.3 96 640 124.7 640 160V352C640 387.3 611.3 416 576 416H480V96zM448 416H192V96H448V416zM272 184C258.7 184 248 194.7 248 208C248 221.3 258.7 232 272 232C285.3 232 296 221.3 296 208C296 194.7 285.3 184 272 184zM368 232C381.3 232 392 221.3 392 208C392 194.7 381.3 184 368 184C354.7 184 344 194.7 344 208C344 221.3 354.7 232 368 232zM272 280C258.7 280 248 290.7 248 304C248 317.3 258.7 328 272 328C285.3 328 296 317.3 296 304C296 290.7 285.3 280 272 280zM368 328C381.3 328 392 317.3 392 304C392 290.7 381.3 280 368 280C354.7 280 344 290.7 344 304C344 317.3 354.7 328 368 328zM64 96H160V416H64C28.65 416 0 387.3 0 352V160C0 124.7 28.65 96 64 96z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BANDAGE]. */
val FA_BAND_AID = FA_BANDAGE
