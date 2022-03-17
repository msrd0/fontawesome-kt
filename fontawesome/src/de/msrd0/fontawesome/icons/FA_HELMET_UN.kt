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

object FA_HELMET_UN: Icon {
	
	override val name get() = "Helmet Un"
	
	override val unicode get() = "e503"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M480 224C497.7 224 512 238.3 512 256C512 273.7 497.7 288 480 288H368V462.5L369.5 464H456C469.3 464 480 474.7 480 488C480 501.3 469.3 512 456 512H360C353.9 512 347.1 509.7 343.5 505.4L214.9 384H87.65C39.24 384 0 344.8 0 296.3V240C0 107.5 107.5 0 240 0C367.2 0 471.2 98.91 479.5 224H480zM320 288H274.4L241.1 343.5L320 417.2V288zM285.3 103.1C281.4 97.26 274.1 94.64 267.4 96.69C260.6 98.73 256 104.9 256 112V208C256 216.8 263.2 224 272 224C280.8 224 288 216.8 288 208V164.8L322.7 216.9C326.6 222.7 333.9 225.4 340.6 223.3C347.4 221.3 352 215.1 352 208V112C352 103.2 344.8 96 336 96C327.2 96 320 103.2 320 112V155.2L285.3 103.1zM160 112C160 103.2 152.8 96 144 96C135.2 96 128 103.2 128 112V176C128 202.5 149.5 224 176 224C202.5 224 224 202.5 224 176V112C224 103.2 216.8 96 208 96C199.2 96 192 103.2 192 112V176C192 184.8 184.8 192 176 192C167.2 192 160 184.8 160 176V112z"/></svg>"""
		else -> null
	}
	
}
